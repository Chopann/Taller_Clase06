package com.juanmanueltorresvillota.taller_clase06

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star

@Composable
fun DetalleScreen(elemento: Elemento, onBack: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(24.dp)
    ) {
        Icon(
            imageVector = Icons.Default.Star,
            contentDescription = null,
            modifier = Modifier.size(64.dp),
            tint = MaterialTheme.colorScheme.primary
        )
        Spacer(Modifier.height(16.dp))
        Text(elemento.titulo, style = MaterialTheme.typography.headlineMedium)
        Text(elemento.categoria, style = MaterialTheme.typography.labelLarge)
        Spacer(Modifier.height(16.dp))
        Text(elemento.descripcionLarga, style = MaterialTheme.typography.bodyLarge)
        Spacer(Modifier.height(24.dp))
        Button(onClick = onBack) { Text("Volver") }
    }
}