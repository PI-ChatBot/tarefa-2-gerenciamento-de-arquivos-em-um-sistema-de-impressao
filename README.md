# Tarefa 2: Aplicação de Pilhas e Filas

## 🧑🏻‍💻 Membros

|                                   Aluno                                    |     RA     |
| :------------------------------------------------------------------------: | :--------: |
|        [Alexandre Raminelli](https://github.com/alexandreraminelli)        | 24.01625-0 |
| [Henrique Yuri Cawamura Seppelfelt](https://github.com/HenriqueSeppelfelt) | 24.00545-2 |
|      [Mateus Martins Gonçalves Dóro ](https://github.com/mateusmats)       | 24.00553-3 |
|            [Pedro Correia ](https://github.com/PedroCorreia73)             | 24.00845-0 |

## 📝 Descrição

Este projeto tem como objetivo implementar um sistema de gerenciamento de impressão de documentos, utilizando estruturas de dados: **Fila (FIFO)** e **Pilha (LIFO)**.

A aplicação simula a fila de impressão e a pilha de reimpressão em uma gráfica rápida, com base nos seguintes requisitos:

- **Fila de Impressão (FIFO)**: documentos são adicionados à fila e impressos na ordem de chegada.
- **Pilha de Reimpressão (LIFO)**: documentos são reimpressos com prioridade para os mais recentes.

### Funcionalidades Implementadas:

1. **Fila de Impressão**:
   - Adicionar documentos à fila de impressão.
   - Imprimir o primeiro documento na fila (FIFO).
   - Consultar a posição de um documento na fila.
   - Limitação de capacidade da fila.
   - Relatório com o tempo de espera de cada documento impresso.

2. **Pilha de Reimpressão**:
   - Adicionar documentos à pilha para reimpressão emergencial.
   - Reimprimir o documento mais recente (LIFO).
   - Consultar a posição de um documento na pilha.
   - Limitação de capacidade da pilha.

### Estruturas de Dados Utilizadas:
- **Fila (FIFO)** para simulação de processo de impressão.
- **Pilha (LIFO)** para simulação de reimpressão emergencial.

## 📂 Arquivos do Projeto

- **Documento.java**: Define a classe `Documento`, representando o documento com informações como nome, usuário e horários de solicitação/atendimento.
- **Fila.java**: Implementa a estrutura de dados de fila (FIFO) para gerenciamento de impressão.
- **Pilha.java**: Implementa a estrutura de dados de pilha (LIFO) para reimpressão emergencial.
- **Main.java**: Contém o código principal, com um menu interativo para o usuário realizar operações de enfileiramento, impressão, consulta e reimpressão.

## ⚙️ Como Executar

1. Clone o repositório.
2. Compile os arquivos `.java`:
   ```bash
   javac Documento.java Fila.java Pilha.java Main.java