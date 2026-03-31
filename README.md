🛒 loja-jpa

📌 Sobre o Projeto

O loja-jpa é um projeto backend desenvolvido em Java com foco em aprendizado da JPA (Java Persistence API) e construção de APIs REST utilizando boas práticas de mercado.

A aplicação simula um sistema de loja/varejo, permitindo o gerenciamento de usuários, produtos, pedidos e categorias, com persistência em banco de dados relacional.

⚠️ Este projeto foi desenvolvido com fins educacionais e de prática.

🚀 Objetivos de Aprendizado  
📚 Praticar JPA / Hibernate  
🧱 Entender arquitetura em camadas  
🔄 Trabalhar com relacionamentos complexos (OneToMany, ManyToMany)  
🌐 Criar APIs REST com Spring Boot  
❗ Implementar tratamento de exceções  
🧪 Aplicar testes básicos  

🛠️ Tecnologias  
☕ Java 11+
🌱 Spring Boot
🗄️ JPA / Hibernate
📦 Maven

🧩 Funcionalidades
CRUD de:
👤 Usuários
📦 Produtos
🧾 Pedidos
🏷️ Categorias

Relacionamentos entre entidades
Tratamento de exceções global

📁 Estrutura do Projeto
src/main/java/com/projeto/loja
├── config          # Configurações
├── entities        # Entidades JPA
├── repositories    # Acesso a dados
├── services        # Regras de negócio
├── resources       # Controllers REST

⚙️ Como Executar
# Clonar o projeto
git clone https://github.com/Antonyj26/loja-jpa.git

# Entrar na pasta
cd loja-jpa

# Instalar dependências
mvn install

💡 Exemplos de Endpoints
Método	Endpoint	Descrição
GET	/users	Lista usuários
GET	/products	Lista produtos
GET	/orders	Lista pedidos
🧠 Aprendizados

Durante o desenvolvimento deste projeto, foram praticados conceitos como:

Mapeamento objeto-relacional (ORM)
Boas práticas com Spring Boot
Separação de responsabilidades (camadas)
Tratamento de exceções com @ControllerAdvice
📌 Status do Projeto

🚧 Em desenvolvimento / estudo contínuo

📷 Melhorias Futuras
Documentação com Swagger
Autenticação com Spring Security
Testes mais robustos
Deploy em nuvem
👨‍💻 Autor

Desenvolvido por Antony 🚀

[Meu Linkedin](https://www.linkedin.com/in/antony-josu%C3%A9-almeida-de-fran%C3%A7a-784ba4202?lipi=urn%3Ali%3Apage%3Ad_flagship3_messaging_conversation_detail%3B6o4s7fG5R5aXamx7dM1S9g%3D%3D)
