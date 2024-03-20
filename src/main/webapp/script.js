/**
 * script for text and feedback message
 */

const text="Engineering Course Navigator";
let index = 0;

function type() {
    if (index < text.length) {
        document.getElementById("typewriter-text").textContent += text.charAt(index);
        index++;
        setTimeout(type, 100); // Adjust typing speed here (milliseconds)
    }
}

type();

  document.getElementById('submitForm').addEventListener('submit', function(e) {
    e.preventDefault(); // Prevent form submission

    // Get form values
    var name = document.getElementById('name').value;
    var email = document.getElementById('email').value;
    var phone = document.getElementById('phone').value;
    var message = document.getElementById('message').value;

    // Construct email body
    var emailBody = "Name: " + name + "\n" +
                    "Email: " + email + "\n" +
                    "Phone: " + phone + "\n" +
                    "Message: " + message;

    // Display success message
      successMsg.innerText = "Your message has been sent successfully!";

    // Clear form fields
    document.getElementById('submitForm').reset();
});