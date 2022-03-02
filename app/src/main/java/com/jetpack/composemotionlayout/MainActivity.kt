package com.jetpack.composemotionlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.jetpack.composemotionlayout.ui.theme.ComposeMotionLayoutTheme

class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMotionLayoutTheme {
                Surface(color = MaterialTheme.colors.background) {
                    CollapsableToolbar()
                }
            }
        }
    }
}