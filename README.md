# Gestor de Turnos de Pacientes

Este proyecto implementa un sistema básico de gestión de turnos médicos en una lista de espera, utilizando exclusivamente `ArrayList`, conforme a las restricciones definidas en el enunciado del ejercicio.

## 🚑 Funcionalidades

- Añadir pacientes a la lista de espera con:
  - Nombre
  - Motivo de consulta
  - Prioridad (1 = Alta, 2 = Media, 3 = Baja)
- Atender al siguiente paciente según su prioridad (orden 1 → 2 → 3).
- Consultar cuántos pacientes quedan por cada nivel de prioridad.
- Mostrar el nombre del siguiente paciente que será atendido.
- Cancelar un turno mediante el nombre del paciente.

## 🧱 Estructura del código

### `Paciente`
Clase que representa un paciente, con atributos:
- `nombre`
- `motivoConsulta`
- `prioridad`

### `GestorTurnos`
Clase principal que gestiona la lógica de la lista de espera:
- Lista interna de pacientes implementada con `ArrayList<Paciente>`
- Métodos para añadir, cancelar, consultar y atender pacientes

## 🚫 Restricciones Técnicas

- No se permite el uso de estructuras avanzadas como `PriorityQueue`.
- Se debe usar exclusivamente `List` o `ArrayList`.
- El diseño inicial debe estar poco organizado, con nombres ambiguos (esto forma parte de la evaluación).
- Toda la lógica debe centralizarse en la clase `GestorTurnos`.

## 🧪 Pruebas Unitarias (JUnit 5)

Se han creado pruebas unitarias para verificar:
- ✅ Añadir pacientes correctamente
- ✅ Obtener el siguiente paciente según prioridad
- ✅ Cancelar un turno por nombre
- ✅ Contar pacientes agrupados por prioridad

## ✏️ Segunda Parte del Examen

Una vez completada la implementación inicial, el código se ha refactorizado para:
- Mejorar nombres de clases, métodos y variables
- Separar lógica en métodos auxiliares
- Evitar duplicación de código

## 📦 Requisitos Técnicos

- Java 17+
- JUnit 5
- IDE recomendado: IntelliJ IDEA

## 🔧 Ejecución

1. Clona el repositorio:
   ```bash
   git clone https://github.com/reyes-art-car/gestor-consulta.git
