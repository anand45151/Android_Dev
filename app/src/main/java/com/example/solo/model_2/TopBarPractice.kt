package com.example.solo.model_2

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Videocam
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarPractice() {
    Scaffold(
        topBar = {
            TopAppBar(

                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Filled.AccountCircle,
                            contentDescription = "Profile",
                            modifier = Modifier
                                .size(40.dp)
                                .padding(end = 8.dp)
                        )

                        Text(
                            text = "Anand",
                            style = MaterialTheme.typography.titleMedium
                        )
                    }
                },


                actions = {

                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Filled.Notifications,
                            contentDescription = "Notifications"
                        )
                    }
IconButton(
    onClick = {

    }
) {
    Icon(
        imageVector = Icons.Filled.Videocam,
        contentDescription = "Video Call"
    )
}

                    IconButton(onClick = {  }) {
                        Icon(
                            imageVector = Icons.Filled.Videocam,
                            contentDescription = "Video Call"
                        )
                    }

                    IconButton(onClick = {  }) {
                        Icon(
                            imageVector = Icons.Filled.Call,
                            contentDescription = "Audio Call"
                        )
                    }

                    IconButton(onClick = {  }) {
                        Icon(
                            imageVector = Icons.Filled.MoreVert,
                            contentDescription = "More Options"
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        ScrollContent(innerPadding)
    }
}


@Composable
fun ScrollContent(x0: PaddingValues) {
    Text(
        text = "Here ",
        modifier = Modifier.padding(x0)
    )
}




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewTopBarPractice(){
    TopBarPractice()
}