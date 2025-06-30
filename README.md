# 📧 Smart Email Assistant (Chrome Extension + Spring Boot Backend)

A smart email assistant that integrates directly into Chrome (Gmail/Outlook), powered by **Spring Boot**, **Spring AI**, and a Chrome extension—automating email generation, replies, summaries, and more.

---

## ✅ Key Features

- 📝 **Email Composition & Suggestions**  
  Generate complete email drafts using prompt-based AI.

- ↩️ **Smart Reply Generator**  
  Context-aware email replies automatically suggested.

- 📚 **Email Summarization**  
  Summarize long email threads for quick understanding.

- 🛠️ **Grammar & Style Improvements**  
  Enhance clarity, tone, and professionalism of your drafts.

- 🗂️ **Keyword Highlighting & Categorization**  
  Highlight key phrases and tag emails (e.g. Urgent, Follow-up).

---

## 🛠 Tech Stack

| Component            | Technology                  |
|----------------------|------------------------------|
| Chrome Extension     | JavaScript, Chrome APIs      |
| Backend              | Spring Boot + Spring AI     |
| AI Integration       | Spring AI (OpenAI API)      |
| API Communication    | REST (JSON)                 |
| UI APIs              | Chrome `chrome.tabs` & `chrome.runtime` |

---

## ⚙️ How to Run the Project Locally

### ✅ Prerequisites

* Java 17+ and Maven
* Google Chrome browser
* OpenAI API key

---

### 🚀 Steps to Setup and Run

#### 1. **Clone the Repository**

```bash
git clone https://github.com/SabinaPathan/Smart_email_Extension.git
cd Smart_email_Extension
---

#### 2. **Configure Backend AI Settings**

gemini.api.url=https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent
gemini.api.key=AIzaSyBrJka-2R4QXH3mzE9ocKsMa3YN_eLi9jU   
server.port=8080
---

#### 3. **Run the Spring Boot Backend**

cd backend-spring-boot
mvn spring-boot:run


---

#### 4. **Load the Chrome Extension**

1. Open Google Chrome and go to:
   `chrome://extensions/`

2. Enable **Developer Mode** (toggle in the top-right corner)

3. Click **"Load unpacked"**

4. Select the folder:
   `frontend-chrome-extension`

---

#### 5. **Use the Smart Email Assistant**

1. Open **Gmail** or **Outlook** in Chrome
2. Click the extension icon (in Chrome’s toolbar)
3. Use features like:

   * ✍️ **Compose**: Generate full email content
   * ↩️ **Reply**: Auto-generate smart responses
   * 📚 **Summarize**: Summarize long emails



