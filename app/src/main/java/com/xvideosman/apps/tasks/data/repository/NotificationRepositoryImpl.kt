package com.xvideosman.apps.tasks.data.repository

import com.xvideosman.apps.tasks.data.db.NotificationDao
import com.xvideosman.apps.tasks.data.model.Notification
import kotlinx.coroutines.flow.Flow

class NotificationRepositoryImpl(private val dao: NotificationDao) : NotificationRepository {
    override suspend fun insertNotification(notification: Notification) {
        dao.insert(notification)
    }

    override suspend fun deleteNotification(notification: Notification) {
        dao.delete(notification)
    }

    override fun getAllNotifications(isAscOrder: Boolean): Flow<List<Notification>> {
        return dao.getAllNotifications(isAscOrder)
    }

    override suspend fun getById(id: Int): Notification {
        return dao.getById(id)
    }

    override suspend fun deleteAllNotifications() {
        dao.deleteAllNotifications()
    }
}