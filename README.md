# Proyecto Final - Aplicación Bancaria

Bienvenido al **Proyecto Final**, una aplicación bancaria interactiva desarrollada en Java. Este proyecto permite a los usuarios realizar operaciones bancarias como depósitos, retiros y consultas de saldo de manera sencilla y amigable.

---

## ✨ Características

- **Interfaz de consola moderna**: Menús claros y mensajes interactivos.
- **Depósitos y retiros**: Realiza transacciones con montos en pesos colombianos.
- **Consulta de saldo**: Visualiza el saldo actual de tu cuenta bancaria.
- **Validaciones robustas**: Manejo de errores para entradas inválidas y fondos insuficientes.
- **Soporte para formato colombiano**: Los montos se muestran con separadores de miles y sin decimales.

---

## 📂 Estructura del Proyecto

El proyecto está organizado de la siguiente manera:

```plaintext
src/
└── ProyectoFinal/
  ├── BankAccount.java  # Lógica de la cuenta bancaria
  ├── BankApp.java      # Interfaz de usuario en consola
  └── Main.java         # Punto de entrada del programa
```

---

## 🛠️ Requisitos Previos

- **Java 8 o superior**: Asegúrate de tener instalado el JDK.
- **IDE recomendado**: Visual Studio Code o cualquier IDE compatible con Java.

---

## 🚀 Cómo Ejecutar

1. Clona este repositorio:

   ```bash
   git clone https://github.com/SEBASCMB/Bank-app-java
   cd Bank-app-java/src/ProyectoFinal
   ```

2. Compila los archivos:

   ```bash
   javac *.java
   ```

3. Ejecuta el programa:

   ```bash
   java Main
   ```

---

## 🧑‍💻 Uso de la Aplicación

1. Al iniciar, se mostrará un menú con las siguientes opciones:

   ```plaintext
   =====================================
      🌟 Welcome to the Bank App 🌟
   =====================================
   1️⃣  Deposit
   2️⃣  Withdraw
   3️⃣  Display Balance
   4️⃣  Exit
   =====================================
   👉 Choose an option:
   ```

2. Selecciona una opción ingresando el número correspondiente:

   - **1**: Ingresa un monto para depositar.
   - **2**: Ingresa un monto para retirar.
   - **3**: Consulta el saldo actual.
   - **4**: Sal de la aplicación.

3. Sigue las instrucciones en pantalla para completar las operaciones.

---

¡Gracias por usar la aplicación bancaria! 😊