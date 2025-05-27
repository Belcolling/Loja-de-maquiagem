package com.projetos.lojaonlinetenis.Model // Declara o pacote onde a classe ImageRepository está localizada.

import com.projetos.lojaonlinetenis.R // Importa os recursos de drawable do projeto (imagens).

// Classe ImageRepository: Representa o repositório de dados para as imagens e informações dos produtos.
class ImageRepository {

    // Método getImages: Retorna uma lista de objetos ImageModel contendo informações sobre os produtos.
    fun getImages(): List<ImageModel> {
        return listOf(
            // Cria uma lista de objetos ImageModel com dados fictícios (imagens, nomes e preços).
            ImageModel(R.drawable.baseliquida, "Base liquída", "R$ 45,00"), // Produto 1
            ImageModel(R.drawable.pocompacto, "Pó compacto", "R$ 55,00"), // Produto 2
            ImageModel(R.drawable.lapisdeolho, "Lápis de olho", "R$ 15,00"), // Produto 3
            ImageModel(R.drawable.rimel, "Rímel", "R$ 40,00 "), // Produto 4
            ImageModel(R.drawable.batom, "Batom", "R$ 60,00"), // Produto 5
            ImageModel(R.drawable.sombras, "Sombra", "R$ 80,00")  // Produto 6
        )
    }
}