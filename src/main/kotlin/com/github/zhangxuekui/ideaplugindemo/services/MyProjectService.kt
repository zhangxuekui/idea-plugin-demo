package com.github.zhangxuekui.ideaplugindemo.services

import com.intellij.openapi.project.Project
import com.github.zhangxuekui.ideaplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
