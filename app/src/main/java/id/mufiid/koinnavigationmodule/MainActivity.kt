package id.mufiid.koinnavigationmodule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.mufiid.koinnavigationmodule.databinding.ActivityMainBinding
import id.mufiid.navigator.ActivityNavigator

class MainActivity : AppCompatActivity() {
    private lateinit var _bind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_bind.root)

        _bind.btnNavigate.setOnClickListener {
            val detailClass = ActivityNavigator.DETAIL_ACTIVITY_CONTAINER.activityDetailClass
            val intent = Intent(this, detailClass)

            startActivity(intent)
        }
    }
}