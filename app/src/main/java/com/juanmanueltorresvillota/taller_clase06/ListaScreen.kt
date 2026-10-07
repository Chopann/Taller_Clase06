package com.juanmanueltorresvillota.taller_clase06

import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun ListaScreen(
    elementos: List<Elemento>,
    listState: LazyListState,
    onElementoClick: (Int) -> Unit
) {
    var query by rememberSaveable { mutableStateOf("") }

    val filtrados = remember(query, elementos) {
        if (query.isBlank()) elementos
        else elementos.filter { it.titulo.contains(query, ignoreCase = true) }
    }
    Column(modifier = Modifier.statusBarsPadding()) {
        OutlinedTextField(
            value = query,
            onValueChange = { query = it },
            label = { Text("Buscar") },
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        )
        LazyColumn (state = listState) {
            items(filtrados, key = { it.id }) { elemento ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { onElementoClick(elemento.id) }
                ) {
                    Row(
                        modifier = Modifier.padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = null,
                            modifier = Modifier.size(40.dp),
                            tint = MaterialTheme.colorScheme.primary
                        )
                        Spacer(Modifier.width(16.dp))
                        Column {
                            Text(elemento.titulo, style = MaterialTheme.typography.titleMedium)
                            Text(elemento.descripcionCorta, style = MaterialTheme.typography.bodySmall)
                        }
                    }
                }
            }
        }
    }
}
