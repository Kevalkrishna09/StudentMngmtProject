// Select the <html> element
const htmlElement = document.querySelector('html');
const themeButton=document.getElementById('button-text');
// Function to toggle themes
function changeTheme() {
    // Check the current theme from localStorage, or default to 'light'
    let currentTheme = localStorage.getItem('theme') || 'light';

    // Toggle between light and dark themes
    if (currentTheme === 'light') {
        htmlElement.classList.add('dark');
        localStorage.setItem('theme', 'dark');  // Save theme preference
        themeButton.textContent="light"
    } else {
        htmlElement.classList.remove('dark');
        localStorage.setItem('theme', 'light');  // Save theme preference
        themeButton.textContent="dark"
    }
}
function labelButtonAsDark(){
   
}

// Example of using the function when a button is clicked
themeButton.addEventListener('click', changeTheme);

// Check stored theme on page load to apply it
document.addEventListener('DOMContentLoaded', () => {
    const savedTheme = localStorage.getItem('theme');
  
    if (savedTheme === 'dark') {
        themeButton.textContent="light";
        htmlElement.classList.add('dark');
    }
    else {
        themeButton.textContent="dark";
        htmlElement.classList.add('light');
    }  
});
