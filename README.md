# Java Console Calculator 

Projeto desenvolvido para estudo de fundamentos da linguagem Java e Programação Orientada a Objetos (POO).

Embora seja uma aplicação simples de console, o foco do desenvolvimento foi a **arquitetura limpa**, evitando o acoplamento de lógica dentro da classe principal.

## Estrutura do Projeto

O código foi organizado para separar a interface do usuário da lógica de negócios:

* **`Main.java`**: Ponto de entrada. Responsável apenas pela interação com o usuário (Input/Output).
* **`CalculatorService.java`**: Camada de serviço que contém a regra de negócio e execução dos cálculos.
* **`Operation.java`**: Definição das operações suportadas pelo sistema.

## Tecnologias
* Java (Core)
* Scanner API (Entrada de dados)
