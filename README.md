# 📱 Clean Factory Pattern – Phone Example  

This project demonstrates the implementation of **Factory** and **Abstract Factory** design patterns in Java, following the principles of *Clean Code*.  

---

## 📂 Project Structure  

clean-factory-pattern-phone/
│── src/
│ ├── Main.java
│ │
│ ├── client/
│ │ └── Client.java
│ │
│ ├── product/
│ │ ├── Phone.java
│ │ ├── GamingPhone.java
│ │ └── RegularPhone.java
│ │
│ └── factory/
│ ├── PhoneFactory.java
│ ├── AbstractPhoneFactory.java
│ └── XiaomiFactory.java
│
└── README.md

yaml
Копировать код

---

## 🚀 How It Works  

- **Simple Factory (`PhoneFactory`)**  
  Creates a phone depending on the given type (`gaming` or `regular`).  

- **Abstract Factory (`XiaomiFactory`)**  
  Implements `AbstractPhoneFactory` to create a family of products (gaming & regular).  

- **Client**  
  Uses only the abstract factory, independent from concrete classes.  

---

## 🖥️ Example Output  

Xiaomi phones:
Xiaomi Black Shark | RAM: 16GB, Processor: Snapdragon 8+ Gen 1, Battery: 6500mAh, Price: $999.99
Xiaomi Redmi Note 11 | RAM: 4GB, Processor: Snapdragon 680, Battery: 5000mAh, Price: $249.99

yaml
Копировать код

---

## 🧹 Clean Code Principles Applied  

✔️ **Meaningful Names** – Clear and descriptive class/method names.  
✔️ **Single Responsibility Principle** – Each class does only one thing.  
✔️ **Open/Closed Principle** – Easy to add new factories without modifying existing code.  
✔️ **Dependency Inversion** – Client depends on abstractions, not implementations.  
✔️ **Consistency** – Uniform naming & folder structure.  
