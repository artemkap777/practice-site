document.addEventListener("DOMContentLoaded", function () {
    const form = document.getElementById("contactForm");
    const status = document.getElementById("formStatus");

    form.addEventListener("submit", function (e) {
        e.preventDefault();

        status.textContent = "Сообщение отправлено!";
        status.style.color = "green";

        form.reset();
    });
});