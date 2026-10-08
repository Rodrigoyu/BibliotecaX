# 📚 BibliotecaX - Sistema de Gerenciamento de Biblioteca

O **BibliotecaX** é um projeto em Java desenvolvido com foco na aplicação prática dos pilares da **Programação Orientada a Objetos (POO)**: Abstração, Herança, Polimorfismo e Interfaces.

O sistema simula as operações básicas de uma biblioteca, permitindo cadastrar diferentes tipos de itens no acervo (como Livros e Revistas), listar detalhes de cada publicação e gerenciar o status de empréstimos e devoluções.

---

## 🎯 Funcionalidades

- **Gerenciamento de Acervo:** Cadastro unificado de itens que estendem uma classe base (`ItemBiblioteca`).
- **Polimorfismo:** Listagem dinâmica dos itens do acervo chamando métodos específicos de cada classe derivada.
- **Controle de Empréstimos:** Itens emprestáveis implementam a interface `emprestimosBiblioteca`, permitindo:
  - Emprestar um item pelo seu ID;
  - Devolver um item;
  - Validação de disponibilidade (impede emprestar itens já emprestados ou que não suportem empréstimo).

---

## 🏗️ Estrutura e Arquitetura do Projeto

```
bibliotecaX/
├── .idea/                      # Configurações do IntelliJ IDEA
├── out/                        # Arquivos binários compilados (.class)
├── src/                        # Código-fonte da aplicação
│   ├── ItemBiblioteca.java     # Classe abstrata base para itens da biblioteca
│   ├── emprestimosBiblioteca.java # Interface com contrato de operações de empréstimo
│   ├── Livro.java              # Classe concreta que representa um livro
│   ├── Revista.java            # Classe concreta que representa uma revista
│   ├── GerenciaBiblioteca.java # Classe controladora que gerencia a lista do acervo
│   └── Main.java               # Classe principal com demonstração de execução
├── bibliotecaX.iml             # Arquivo de configuração de módulo do IntelliJ
└── README.md                   # Documentação do projeto
```

### Principais Classes e Interfaces

| Componente | Tipo | Descrição |
| :--- | :--- | :--- |
| [`ItemBiblioteca`](file:///C:/Users/rodrigo/IdeaProjects/bibliotecaX/src/ItemBiblioteca.java) | Classe Abstrata | Define os atributos comuns (`id`, `titulo`) e o contrato `exibirDetalhes()`. |
| [`emprestimosBiblioteca`](file:///C:/Users/rodrigo/IdeaProjects/bibliotecaX/src/emprestimosBiblioteca.java) | Interface | Declara métodos para empréstimo e devolução (`emprestar()`, `devolver()`, `isEmprestado()`). |
| [`Livro`](file:///C:/Users/rodrigo/IdeaProjects/bibliotecaX/src/Livro.java) | Classe Concreta | Representa um livro com autor e status de empréstimo. |
| [`Revista`](file:///C:/Users/rodrigo/IdeaProjects/bibliotecaX/src/Revista.java) | Classe Concreta | Representa uma revista com autor/edição e status de empréstimo. |
| [`GerenciaBiblioteca`](file:///C:/Users/rodrigo/IdeaProjects/bibliotecaX/src/GerenciaBiblioteca.java) | Classe de Serviço | Gerencia a lista de itens, permitindo cadastrar, listar e emprestar. |
| [`Main`](file:///C:/Users/rodrigo/IdeaProjects/bibliotecaX/src/Main.java) | Classe Principal | Ponto de entrada (`main`) que executa cenários de teste do sistema. |

---

## 💻 Pré-requisitos

Para executar o projeto em outra máquina, certifique-se de ter instalado:

- **Java Development Kit (JDK):** Versão 17 ou superior (recomendado JDK 17, 21 ou superior).
- **Git** (opcional, para clonar o repositório).
- Uma IDE de sua preferência (como **IntelliJ IDEA**, **VS Code** ou **Eclipse**) ou apenas o terminal do sistema operacional.

Para verificar se o Java está instalado na máquina:
```bash
java -version
javac -version
```

---

## 🚀 Como Instalar 

### 1. Obtenha os arquivos do projeto

Clone o repositório ou extraia os arquivos na máquina de destino:
```bash
git clone https://github.com/Rodrigoyu/BibliotecaX.git
```
---

### Opção 2: Utilizando o IntelliJ IDEA

1. Abra o **IntelliJ IDEA**.
2. Clique em **File > Open...** (ou *Open* na tela inicial).
3. Selecione a pasta do projeto `BibliotecaX` e clique em **OK**.
4. Verifique a versão do JDK:
   - Acesse **File > Project Structure > Project**.
   - No campo **SDK**, certifique-se de selecionar um JDK instalado (versão 17 ou superior).
5. Abra o arquivo [`Main.java`](file:///C:/Users/rodrigo/IdeaProjects/bibliotecaX/src/Main.java) localizado em `src/Main.java`.
6. Clique no ícone verde de **Run** (▶️) ao lado de `public static void main(String[] args)` ou use o atalho `Shift + F10`.

---

### Opção 3: Utilizando o Visual Studio Code

1. Abra o VS Code e certifique-se de ter o pacote de extensões **Extension Pack for Java** instalado.
2. Acesse **File > Open Folder...** e selecione a pasta `BibliotecaX`.
3. Abra o arquivo `src/Main.java`.
4. Clique no botão **Run** que aparecerá logo acima do método `main`.

---

## 📊 Exemplo de Saída Esperada

Ao executar a classe `Main`, a saída no terminal será semelhante a:

```text
----- Livro -----
ID: 1
Titulo: Clean Code
Autor: Robert C. Martin
Status: Disponivel
----------------
----- Livro -----
ID: 2
Titulo: Java para Iniciantes
Autor: Herbert Schildt
Status: Disponivel
----------------
---Livro---
ID: 1
Titulo: BTS
Autor: BTS
Status: Disponivel

--- TESTANDO EMPRÉSTIMOS ---
O livro Clean Code foi emprestado!
livro Clean Code indisponivel para emprestar

----- Livro -----
ID: 1
Titulo: Clean Code
Autor: Robert C. Martin
Status: Emprestado
----------------
----- Livro -----
ID: 2
Titulo: Java para Iniciantes
Autor: Herbert Schildt
Status: Disponivel
----------------
---Livro---
ID: 1
Titulo: BTS
Autor: BTS
Status: Disponivel
```

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java (JDK 17+)
- **Paradigma:** Programação Orientada a Objetos (POO)
- **IDE Recomendada:** IntelliJ IDEA

---

## 👨‍💻 Autor

Desenvolvido por **José Rodrigo**  
GitHub: [@Rodrigoyu](https://github.com/Rodrigoyu)
