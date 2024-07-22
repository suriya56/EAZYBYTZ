document.addEventListener('DOMContentLoaded', () => {
    const stockForm = document.getElementById('stockForm');
    const companyInput = document.getElementById('company');
    const quantityInput = document.getElementById('quantity');
    const portfolioList = document.getElementById('portfolio');
    const messageElement = document.getElementById('message');

    stockForm.addEventListener('submit', (event) => {
        event.preventDefault();

        const companyName = companyInput.value.trim();
        const quantity = parseInt(quantityInput.value.trim(), 10);

        if (companyName && !isNaN(quantity) && quantity > 0) {
            addToPortfolio(companyName, quantity);
            companyInput.value = '';
            quantityInput.value = '';
            messageElement.textContent = ''; // Clear message if input is valid
        } else {
            messageElement.textContent = 'Please enter a valid company name and quantity.';
        }
    });

    function addToPortfolio(companyName, quantity) {
        const listItem = document.createElement('li');
        listItem.textContent = `${companyName} - ${quantity} shares`;
        portfolioList.appendChild(listItem);
    }
});
