# 📚 OOP1 - Practical Exercise: Library System

**English:**  
Practical exercise for Object-Oriented Programming I – IFRS Osório.  
Implementation of a simple library system using Java, applying inheritance, encapsulation, aggregation, and polymorphism.

**Português:**  
Exercício prático da disciplina Programação Orientada a Objetos I – IFRS Osório.  
Implementação de um sistema básico de biblioteca em Java, utilizando herança, encapsulamento, agregação e polimorfismo.

---

## 🧱 Project Structure

- `Livro.java` – Classe base que representa um livro.
- `Editora.java` – Classe agregada ao livro, com informações da editora.
- `LivroFisico.java` – Subclasse de `Livro` com preço.
- `Ebook.java` – Subclasse de `Livro` com preço e formato (ex: PDF).
- `Biblioteca.java` – Classe que armazena os livros e permite listagens.
- `MainClass.java` – Classe principal com objetos de teste e execução do programa.

---

## 🧪 Features & Behaviors

- Criação de livros físicos e eBooks com validações de preço.
- Associação de editoras aos livros.
- Listagens por:
  - Ordem alfabética de títulos
  - Livros publicados após 2015
  - eBooks no formato PDF

---

## 🚀 How to Run

1. Clone o repositório:

   ```bash
   git clone https://github.com/ericfr1tzenvalle/OOP1-Practical-Exercise-Library.git
   ```

2. Abra o projeto no **NetBeans** ou em outro IDE compatível com Java.
3. Compile e execute a classe `MainClass`.

---

## ⚠️ Error Handling

- **Preço inválido:**  
  Atribuições de preços negativos disparam exceções `IllegalArgumentException`.

---

## 📁 Build & Ignore

Este projeto inclui um `.gitignore` que exclui arquivos de build, configurações privadas do NetBeans e diretórios desnecessários ao versionamento.

---

## 📄 License

Este projeto está licenciado sob a [MIT License](LICENSE).
