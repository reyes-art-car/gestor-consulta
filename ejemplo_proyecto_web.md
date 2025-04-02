# 🛍️ Ejemplo práctico: Proyecto de tienda online

## ✅ Descripción de la aplicación
Una aplicación web de comercio electrónico que permite a los usuarios:

- Registrarse e iniciar sesión
- Navegar por un catálogo de productos
- Añadir productos al carrito
- Realizar pagos online
- Recibir confirmaciones por correo electrónico
- (Opcional) Comentar o valorar productos

## 🧪 Planificación de pruebas por fases

### 1. Inicio del proyecto
- Se analizan los requisitos clave.
- Se definen casos de prueba y criterios de aceptación.

### 2. Durante el desarrollo
- Se implementan **pruebas unitarias** para funciones como el cálculo de totales o validaciones.
- Se realizan **pruebas de integración** (por ejemplo, entre frontend, backend y base de datos).

### 3. Pruebas funcionales (end-to-end)
- Se automatiza el flujo completo: búsqueda, compra y confirmación.
- Se usan herramientas como **Selenium** o **Cypress**.

### 4. Pruebas de regresión
- Cada nueva función (por ejemplo, reseñas) se valida sin romper funcionalidades anteriores.
- Se ejecuta un conjunto de pruebas ya existentes para asegurar estabilidad.

### 5. DevOps / CI-CD
- Las pruebas están integradas en pipelines de integración continua.
- Cada cambio de código lanza automáticamente pruebas unitarias, de integración y funcionales.
