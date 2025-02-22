package com.esmaeel.appstate

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.esmaeel.appstate.databinding.ActivityOneBinding
import com.esmaeel.statelib.appHasNetwork
import com.esmaeel.statelib.currentActivity
import com.esmaeel.statelib.hasInternet

class ActivityOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        with(ActivityOneBinding.inflate(layoutInflater)) {
            setContentView(this.root)

            currentActivityText.text = "Current Activity : $currentActivity"
            currentActivityText.setOnClickListener {
                currentActivityText.text = currentActivity?.localClassName
            }

            currentNetworkState.text = "App Has Network : $appHasNetwork"

            currentNetworkState.setOnClickListener {
                currentNetworkState.text = "App Has Network : $appHasNetwork"
            }

            nextButton.setOnClickListener {
                startActivity(
                    Intent(
                        this@ActivityOne,
                        ActivityTwo::class.java
                    )
                )
            }

        }
    }
}