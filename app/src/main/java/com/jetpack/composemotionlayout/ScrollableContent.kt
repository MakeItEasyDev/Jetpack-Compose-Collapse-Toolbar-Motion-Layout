package com.jetpack.composemotionlayout

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun ScrollableContent() {
    val list = listOf(1..20).flatten()

    LazyColumn(
        modifier = Modifier.padding(bottom = 56.dp)
    ) {
        items(
            items = list,
            itemContent = { id ->
                ScrollableContentItem(id = id.toString())
            }
        )
    }
}

@Composable
fun ScrollableContentItem(id: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(16.dp),
        backgroundColor = MaterialTheme.colors.surface,
        elevation = 4.dp
    ) {
        Box(
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Jetpack Compose $id",
                color = MaterialTheme.colors.onSurface,
                style = MaterialTheme.typography.h5
            )
        }
    }
}














