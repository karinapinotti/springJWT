# 🔐 Spring Security JWT API

API REST desenvolvida com **Spring Boot + Spring Security + JWT** durante estudos de autenticação e autorização utilizando tokens.

Projeto focado em:
- Spring Security
- JWT Authentication
- OAuth2 concepts
- Proteção de rotas
- Login autenticado
- Geração e validação de token
- API REST segura

---

# 🚀 Tecnologias

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-000000?style=for-the-badge&logo=jsonwebtokens)
![OAuth2](https://img.shields.io/badge/OAuth2-EB5424?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven)

---

# 📚 Conceitos aplicados

## 🔹 Spring Security
Implementação de autenticação e autorização utilizando filtros e configuração de segurança.

## 🔹 JWT (JSON Web Token)
Uso de token JWT para autenticação stateless.

Fluxo:
1. Usuário faz login
2. API valida credenciais
3. Token JWT é gerado
4. Cliente envia token no Authorization Header
5. API valida o token em cada requisição

---

## 🔹 OAuth2
Estudo dos conceitos de autenticação baseada em tokens e autorização segura entre aplicações.

## 🔹 Proteção de Rotas
Rotas privadas protegidas utilizando Spring Security.

Exemplo:

```java
.requestMatchers("/auth/**").permitAll()
.anyRequest().authenticated()
```

---

## 🔹 API REST
Endpoints REST utilizando:
- `@RestController`
- `@RequestMapping`
- `@PostMapping`
- `@GetMapping`

---

# 🗂️ Estrutura do projeto

```bash
src/main/java
│
├── config
├── controller
├── dto
├── exception
├── model
├── repository
├── security
├── service
└── SpringJwtApplication
```

---

# 🔑 Autenticação JWT

## Login

```http
POST /auth/login
```

Exemplo:

```json
{
  "username": "admin",
  "password": "123456"
}
```

Resposta:

```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9..."
}
```

---

# 🔒 Rotas protegidas

Enviar token no header:

```http
Authorization: Bearer TOKEN
```

---

# ⚙️ Configuração

## application.properties

```properties
spring.application.name=springJWT

jwt.secret=secret-key
jwt.expiration=3600000
```

---

# ▶️ Como executar

## Clonar projeto

```bash
git clone https://github.com/karinapinotti/springJWT.git
```

---

## Entrar na pasta

```bash
cd springJWT
```

---

## Executar aplicação

```bash
./mvnw spring-boot:run
```

Ou executar pela IDE:
- IntelliJ IDEA
- VSCode
- Eclipse

---

# 📌 Funcionalidades

- Login autenticado
- Geração de JWT
- Validação de token
- Proteção de endpoints
- Autorização com Spring Security
- API stateless
- Filtros de autenticação

---

# 🧠 Aprendizados

Projeto criado para prática de:
- Spring Security
- JWT
- OAuth2
- Authentication Flow
- Authorization
- Stateless APIs
- Filters
- Security Config
- REST APIs

---

# 👩‍💻 Autora

## Karina Pinotti

🔗 GitHub: https://github.com/karinapinotti  
🔗 LinkedIn: https://www.linkedin.com/in/karina-bruschi-pinotti/

---

# 📌 GitHub Linguist

Adicionar arquivo `.gitattributes` na raiz do projeto:

```gitattributes
*.java linguist-detectable=true
*.html linguist-detectable=false
*.css linguist-detectable=false
*.js linguist-detectable=false
```

---
