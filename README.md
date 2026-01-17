# Projeto Threads em Java

Projetinho desenvolvido na disciplina de **Sistemas Operacionais** (ADS – IFPR) com o objetivo de entender o funcionamento de **threads** em Java.

## 📌 Descrição

O programa cria uma quantidade definida de threads, onde cada thread imprime uma mensagem no console identificando seu próprio ID. A ideia é demonstrar, de forma simples, a criação e execução concorrente de múltiplas threads.

## 🧵 Como funciona

* A classe `Main` inicia a aplicação.
* `HelloMaster` é responsável por criar e iniciar várias threads.
* Cada thread executa a classe `HelloFromThread`, que imprime um `hello world` no console.
