Plataforma de Reservas para Pet Shop
Projeto acadêmico em Java para modelar reservas e os elementos envolvidos no atendimento de um pet shop, como tutores, pets, serviços, profissionais, recintos e agendamentos.

Equipe
Diogo Marcelino Pedroso de Lima
Maria Luiza de Oliveira Fernandes
Requisitos
JDK 25
Maven Wrapper incluído no projeto
O Wrapper baixa e utiliza a versão do Maven configurada no projeto. O JDK 25 precisa estar instalado.

Como executar
Abra um terminal nesta pasta (petShop) e compile o projeto:

./mvnw clean compile
Execute a classe principal:

java -cp target/classes org.example.Main
A classe principal imprime uma mensagem de demonstração.

Testes
Execute os testes automatizados com:

./mvnw test
No Windows, use mvnw.cmd no lugar de ./mvnw:

.\mvnw.cmd clean compile
java -cp target\classes org.example.Main
.\mvnw.cmd test
Estrutura
src/main/java/org/example/entities: entidades do domínio.
src/main/java/org/example/enuns: enumerações usadas pelo domínio.
src/main/java/org/example/interfaces: interfaces do projeto.
src/test/java: testes automatizados.
