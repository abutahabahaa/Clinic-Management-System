# Clinic Management System 🏥

A comprehensive **Clinic Management System** developed as a course project for **Software Engineering (CSCI 2313)** and **Web & Multimedia Engineering (WDMM 3314)** at the Islamic University of Gaza. The system is designed to automate and streamline administrative and operational tasks in clinics affiliated with **Touch Clinics Company**.

## 📌 Table of Contents

- [Project Overview](#project-overview)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [System Architecture](#system-architecture)
- [Modules](#modules)
- [Installation](#installation)
- [Project Team](#project-team)
- [Testing](#testing)
- [License](#license)

---

## 📖 Project Overview

This system is built to manage:
- Patient registration and medical records
- Appointment scheduling
- Doctor availability
- Billing and invoice generation
- Report generation
- Inventory and admin dashboards

The system follows the **Waterfall Model** for software development: Requirements → Design → Implementation → Testing → Delivery.

---

## ✅ Features

- 📅 **Appointment Booking**: Patients or receptionists can book and manage appointments.
- 🩺 **Doctor Module**: Doctors can access patient records and generate reports.
- 💳 **Billing System**: Automated invoice generation and payment tracking.
- 📊 **Reports**: Generate statistical and operational reports.
- 🔒 **Secure Access**: Role-based login for patients, doctors, and admins.

---

## 🛠️ Tech Stack

| Layer       | Technology              |
|-------------|--------------------------|
| Frontend    | HTML5, CSS3, JavaScript |
| Backend     | PHP / Python (Flask)    |
| Database    | MySQL                   |
| Tools       | Visual Studio Code, Trello, GitHub |

Project follows the **MVC (Model-View-Controller)** pattern.

---

## 🧱 System Architecture

The system is divided into three main packages:

1. **UI (User Interface)**  
   - Login Form  
   - Dashboard  
   - Appointment Form

2. **Business Logic**  
   - Appointment Manager  
   - Billing Manager

3. **Data Access**  
   - Patient DB  
   - Appointment DB

---

## 📦 Modules

### ➤ Appointment Manager
- `scheduleAppointment()`
- `cancelAppointment()`

### ➤ Billing Manager
- `generateInvoice()`
- `applyInsurance()`

### ➤ Patient DB
- `addPatient()`
- `getPatientByID()`

### ➤ Appointment DB
- `saveAppointment()`
- `getAppointmentsByDoctor()`

---

## 🚀 Installation

> Note: This project is under academic development. Production deployment is not supported yet.

1. Clone the repository:
```bash
git clone https://github.com/abutahabahaa/Clinic-Management-System.git
