package com.simsekselim.expandablecard

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.unit.dp


@Composable
fun RowScope.TableCell(
    text: String,
    weight: Float
) {
    Text(
        text = text,
        Modifier
            .border(1.dp, androidx.compose.ui.graphics.Color.Black)
            .weight(weight)
            .padding(8.dp)
    )
}

@Composable
fun TableScreen() {
    // Just a fake data... a Pair of Int and String
    val tableData = (1..100).mapIndexed { index, item ->
        index to "Item $index"
    }
    // Each cell of a column must have the same weight.
    val column1Weight = .2f // 30%
    val column2Weight = .2f // 70%
    val column3Weight = .2f // 70%
    val column4Weight = .2f // 70%
    val column5Weight = .2f // 70%
    // The LazyColumn will be our table. Notice the use of the weights below
    LazyColumn(
        Modifier
            .fillMaxSize()
            .padding(16.dp)) {
        // Here is the header
        item {
            Row(Modifier.background(Gray)) {
                TableCell(text = "Sütun 1", weight = column1Weight)
                TableCell(text = "Sütun 2", weight = column2Weight)
                TableCell(text = "Sütun 3", weight = column3Weight)
                TableCell(text = "Sütun 4", weight = column4Weight)
                TableCell(text = "Sütun 5", weight = column5Weight)
            }
        }
        // Here are all the lines of your table.
        items(tableData) {
            val (id, text) = it
            Row(Modifier.fillMaxWidth()) {
                TableCell(text = id.toString(), weight = column1Weight)
                TableCell(text = text, weight = column2Weight)
                TableCell(text = text, weight = column3Weight)
                TableCell(text = text, weight = column4Weight)
                TableCell(text = text, weight = column5Weight)
            }
        }
    }
}

