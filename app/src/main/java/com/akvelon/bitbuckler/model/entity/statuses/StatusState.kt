/**
 * All rights reserved by Akvelon Inc.
 *
 * Created by Ignat Krasnov (ignat.krasnov@akvelon.com)
 * on 24 December 2020
 */

package com.akvelon.bitbuckler.model.entity.statuses

enum class StatusState(val order: Int) {
    FAILED(0),
    STOPPED(1),
    INPROGRESS(2),
    SUCCESSFUL(3)
}
