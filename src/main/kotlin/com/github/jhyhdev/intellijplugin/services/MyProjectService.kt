package com.github.jhyhdev.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.jhyhdev.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
