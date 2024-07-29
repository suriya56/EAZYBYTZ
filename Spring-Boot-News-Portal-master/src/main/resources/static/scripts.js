document.addEventListener('DOMContentLoaded', (event) => {
    const apiKey = '0043381849804e75a27c95aad0cffdd7';
    const newsContainer = document.getElementById('news-container');

    async function fetchNews() {
        const response = await fetch(`https://newsapi.org/v2/top-headlines?country=us&apiKey=${apiKey}`);
        const data = await response.json();
        return data.articles;
    }

    function displayNews(articles) {
        newsContainer.innerHTML = '';
        articles.forEach(article => {
            const articleElement = document.createElement('div');
            articleElement.className = 'news-article';

            const imageUrl = article.urlToImage ? article.urlToImage : 'https://sadbhawnapaati.com/wp-content/uploads/2021/03/news.jpg'; // Placeholder image if no image is available

            articleElement.innerHTML = `
                <img src="${imageUrl}" alt="${article.title}" class="news-image">
                <h2>${article.title}</h2>
                <a href="${article.url}" target="_blank">Read more</a>
            `;

            newsContainer.appendChild(articleElement);
        });
    }

    fetchNews().then(articles => displayNews(articles)).catch(error => console.error('Error fetching news:', error));
});
