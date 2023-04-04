package ru.yarsu.models

import org.http4k.template.ViewModel
import ru.yarsu.domain.Course

data class ShowLecturersCourseVM( val courses: List<Course>): ViewModel