package com.xvideosman.apps.tasks.util.preference

import com.xvideosman.apps.tasks.model.SortOrder

data class FilterPreferences(
    val sortOrder: SortOrder,
    val viewType: Boolean,
)