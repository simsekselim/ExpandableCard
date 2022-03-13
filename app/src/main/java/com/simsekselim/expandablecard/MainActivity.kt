package com.simsekselim.expandablecard

import ExpandableCard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExpandableCard(
                title = "My Title",
                description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                        "sed do eiusmod tempor incididunt ut labore et dolore magna " +
                        "aliqua. Ut enim ad minim veniam, quis nostrud exercitation " +
                        "ullamco laboris nisi ut aliquip ex ea commodo consequat."
            )


        }

    }
}


