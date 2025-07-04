# 🦠 Coronavirus Tracker

A Java-based real-time tracker for global and country-level COVID-19 data, powered by Spring Boot and REST APIs.

---

## ✅ Table of Contents

- [🔧 Features](#-features)  
- [🛠 Tech Stack](#-tech-stack)  
- [🚀 Demo](#-demo)  
- [📥 Installation & Usage](#-installation--usage)  
- [🔗 API Endpoints](#-api-endpoints)  
- [📊 Data Sources](#-data-sources)  
- [💡 Architecture](#-architecture)  
- [🧪 Testing](#-testing)  
- [🛠 Roadmap](#-roadmap)  
- [📄 License](#-license)

---

## 🔧 Features

- 📈 Fetches live COVID-19 data (e.g., global and country stats)
- 💾 Caches data for reduced API calls
- 🧩 MVC structure with controllers, service layers, and models
- 📦 Packaged as executable JAR for easy deployment
- 🔧 Easily extended—add new endpoints or integrate different data sources

---

## 🛠 Tech Stack

| Layer        | Technology                  |
|--------------|-----------------------------|
| Backend      | Java, Spring Boot           |
| Build Tool   | Maven or Gradle             |
| REST         | Spring Web MVC             |
| HTTP Client  | (e.g., RestTemplate or WebClient) |
| Caching      | In-memory / configurable    |
| Testing      | JUnit, Mockito             |

---

## 🚀 Demo

⚠️ *Include screenshots or animated GIFs here. E.g.:*

![Homepage Stats View](./docs/screenshot-global-stats.png)

![Country Data Endpoint Response](./docs/screenshot-country.json.png)

---

## 📥 Installation & Usage

### 1. Clone the repository:

git clone https://github.com/codeboi121/coronavirus-tracker.git
cd coronavirus-tracker


### 2. Build the project:


# If you're using Maven:
mvn clean package

# Or for Gradle:
./gradlew build


### 3. Run the application:


java -jar target/coronavirus-tracker-<version>.jar

Application starts at `http://localhost:8080`

---

## 🔗 API Endpoints

| HTTP Method | Endpoint                           | Description                                 |
| ----------- | ---------------------------------- | ------------------------------------------- |
| GET         | `/api/v1/global`                   | Retrieves global COVID-19 statistics        |
| GET         | `/api/v1/countries/{countryCode}`  | Retrieves stats for the given country       |
| GET         | `/api/v1/countries`                | Retrieves stats for all supported countries |
| GET         | `/api/v1/countries/{code}/history` | Retrieves historical time-series data       |

*Replace `{countryCode}` with ISO alpha-2 or alpha-3 codes (e.g., `US`, `IND`).*

---

## 📊 Data Sources

* 🧭 **Johns Hopkins University CSSE** (default)
* 📰 **New York Times** (US-specific)
* ⚙️ *Add more sources easily by injecting alternate service beans via Spring config*

---

## 💡 Architecture

```
Controller → Service → DataFetcher → DTOs → API Response
```

* **Controller**: Handles HTTP routing
* **Service Layer**: Business logic, caching
* **DataFetcher**: Fetches/parses external API or CSV
* **Models/DTOs**: Data mapping
* **Tests**: Unit and integration tests for each layer

---

## 🧪 Testing

Run all tests using:

```bash
mvn test
# or
./gradlew test
```

Ensure service logic and API endpoints are covered before adding new features or data sources.

---

---

## 📄 License

This project is licensed under the **MIT License**. See the [LICENSE](./LICENSE) file for details.

---

*Built with ❤️ by [codeboi121](https://github.com/codeboi121)*

````

---
