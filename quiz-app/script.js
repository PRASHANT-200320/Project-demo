// script.js
import { quizData } from "./quizData.js";

let currentIndex = 0;
let score = 0;
let currentCategory = "";
const questionEl = document.getElementById("question-text");
const answerBox = document.getElementById("answers");
const feedback = document.getElementById("feedback");
const progress = document.getElementById("progress");

window.startQuiz = function (category) {
  currentCategory = category;
  currentIndex = 0;
  score = 0;
  document.getElementById("category-select").classList.add("hide");
  document.getElementById("quiz-box").classList.remove("hide");
  document.getElementById("result-box").classList.add("hide");
  loadQuestion();
};

function loadQuestion() {
  feedback.textContent = "";
  const data = quizData[currentCategory][currentIndex];
  questionEl.textContent = data.q;
  answerBox.innerHTML = "";

  data.options.forEach(opt => {
    const btn = document.createElement("button");
    btn.textContent = opt;
    btn.onclick = () => checkAnswer(btn, opt === data.correct);
    answerBox.appendChild(btn);
  });

  updateProgress();
  document.getElementById("next-btn").style.display = "none";
}

function checkAnswer(btn, correct) {
  Array.from(answerBox.children).forEach(b => b.disabled = true);
  btn.classList.add(correct ? "correct" : "wrong");
  feedback.textContent = correct ? "✅ Correct!" : "❌ Wrong!";
  if (correct) score++;
  document.getElementById("next-btn").style.display = "inline-block";
}

document.getElementById("next-btn").addEventListener("click", () => {
  currentIndex++;
  if (currentIndex < quizData[currentCategory].length) {
    loadQuestion();
  } else {
    showResult();
  }
});

function updateProgress() {
  const percent = ((currentIndex) / quizData[currentCategory].length) * 100;
  progress.style.width = percent + "%";
}

function showResult() {
  document.getElementById("quiz-box").classList.add("hide");
  document.getElementById("result-box").classList.remove("hide");
  const total = quizData[currentCategory].length;
  document.getElementById("final-score").textContent = `${score} / ${total} (${Math.round((score / total) * 100)}%)`;
}

window.restartQuiz = function () {
  document.getElementById("category-select").classList.remove("hide");
  document.getElementById("quiz-box").classList.add("hide");
  document.getElementById("result-box").classList.add("hide");
};
