package com.xvideosman.apps.tasks.model

import com.xvideosman.apps.tasks.data.model.SubTask

sealed class SubTaskEvent {
    object Initial : SubTaskEvent()
    data class ShowUndoDeleteTaskMessage(val subTask: SubTask) : SubTaskEvent()
    object NavigateToAllCompletedScreen : SubTaskEvent()
}

