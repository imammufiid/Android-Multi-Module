@file:Suppress("UNCHECKED_CAST")

package id.mufiid.detail.navigator

import android.app.Activity
import id.mufiid.detail.ui.DetailActivity
import id.mufiid.navigator.activity.DetailActivityContainer

class ActivityContainerImpl: DetailActivityContainer {
    override val activityDetailClass: Class<Activity>
        get() = DetailActivity::class.java as Class<Activity>
}