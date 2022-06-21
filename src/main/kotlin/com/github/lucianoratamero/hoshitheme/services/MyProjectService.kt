package com.github.lucianoratamero.hoshitheme.services

import com.intellij.openapi.project.Project
import com.github.lucianoratamero.hoshitheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
