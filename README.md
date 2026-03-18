# ♟️ Chess System - Java 17

Este projeto é um motor de jogo de xadrez completo, desenvolvido em **Java 17** com o objetivo de consolidar conceitos avançados de **Orientação a Objetos** e **Arquitetura de Software**.

O diferencial deste projeto é a separação clara de domínios, garantindo que a lógica genérica de um tabuleiro seja independente das regras específicas do xadrez.

Youtube: ```https://youtu.be/zY11x2ipWPM```


---

## 🚀 Funcionalidades

* **Partida Completa:** Execução de todos os movimentos e capturas do xadrez.
* **Lógica de Xeque e Xeque-mate:** Sistema automatizado que identifica ameaças ao Rei e encerra a partida conforme as regras oficiais.
* **Validação de Movimentos:** Cálculo em tempo real dos movimentos possíveis para cada peça, impedindo jogadas ilegais.
* **Interface via Console:** Representação visual do tabuleiro e das peças capturadas diretamente no terminal.

---

## 🏗️ Arquitetura e Engenharia

A estrutura foi desenhada focando na **separação de responsabilidades**:

1. **Board Layer (Camada de Tabuleiro):** Camada genérica que gerencia a matriz do jogo, o posicionamento das peças e o tratamento de erros de posição.
2. **Chess Layer (Camada de Xadrez):** Camada de negócio que implementa as regras específicas (comportamento de cada peça e lógica da partida).

### Princípios Aplicados:
* **SOLID:** Classes com responsabilidade única e baixo acoplamento.
* **Exception Handling:** Tratamento customizado para movimentos inválidos e erros de sistema.
* **Clean Code:** Código legível e focado em manutenibilidade.

---

## 🛠️ Tecnologias e Ferramentas

* **Linguagem:** Java 17
* **Paradigma:** Orientação a Objetos
* **Interface:** Command Line Interface (CLI)

---

## 🎮 Como Executar

Certifique-se de ter o **JDK 17** (ou superior) instalado em sua máquina.

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/AndersonFilho14/xadrez_2.0.git
   ```

2. **Compile o projeto:**
   ```bash
   find -name '*.java' | xargs javac && java Main
   ```
   
---
## ✍️ Autor

Anderson F.
- www.linkedin.com/in/anderson-filho-dev