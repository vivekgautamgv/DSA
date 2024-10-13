import pandas as pd
import requests
from bs4 import BeautifulSoup

# URL of the webpage to scrape
url = "https://www.screener.in/screens/71064/all-stocks/?page=1&limit=50"

# Send a request to the website
response = requests.get(url)

# Parse the HTML content
soup = BeautifulSoup(response.content, 'html.parser')

# Find the table that contains the stock data
table = soup.find('table')

# Extract column headers
headers = [header.text for header in table.find_all('th')]

# Extract rows of data
data = []
for row in table.find_all('tr')[1:]:  # Skip header row
    columns = row.find_all('td')
    if columns:
        data.append([column.text.strip() for column in columns])

# Create a DataFrame
df = pd.DataFrame(data, columns=headers)

# Save DataFrame to Excel
df.to_excel('stock_data.xlsx', index=False)

print("Data extracted and saved to stock_data.xlsx")
