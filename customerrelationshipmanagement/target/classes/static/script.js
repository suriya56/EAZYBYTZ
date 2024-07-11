// scripts.js

document.addEventListener("DOMContentLoaded", function() {
    // Load sales records
    fetch('/api/sales')
        .then(response => response.json())
        .then(data => {
            const salesTableBody = document.querySelector('table tbody');
            salesTableBody.innerHTML = '';
            data.forEach(record => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${record.id}</td>
                    <td>${record.customerName}</td>
                    <td>${record.product}</td>
                    <td>${record.amount}</td>
                    <td>${record.status}</td>
                `;
                salesTableBody.appendChild(row);
            });
        });

    // Load tasks
    fetch('/api/tasks')
        .then(response => response.json())
        .then(data => {
            const tasksTableBody = document.querySelectorAll('table tbody')[1];
            tasksTableBody.innerHTML = '';
            data.forEach(task => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${task.id}</td>
                    <td>${task.task}</td>
                    <td>${task.dueDate}</td>
                    <td>${task.status}</td>
                `;
                tasksTableBody.appendChild(row);
            });
        });

    // Load support tickets
    fetch('/api/support')
        .then(response => response.json())
        .then(data => {
            const supportTableBody = document.querySelectorAll('table tbody')[2];
            supportTableBody.innerHTML = '';
            data.forEach(ticket => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${ticket.id}</td>
                    <td>${ticket.issue}</td>
                    <td>${ticket.customer}</td>
                    <td>${ticket.status}</td>
                `;
                supportTableBody.appendChild(row);
            });
        });
});
