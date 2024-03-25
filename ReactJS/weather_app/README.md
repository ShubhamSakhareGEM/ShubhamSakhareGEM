# Weather App

## Project Description
The Weather App is a simple web application that allows users to check the weather conditions for a specific city. It displays real-time weather data such as temperature, humidity, wind speed, and weather description. The application is built using React.js and integrates with the OpenWeatherMap API to fetch weather information.

### Tech Stack
- React.js
- Axios (for API requests)
- React Loader Spinner (for loading animation)
- Font Awesome (for icons)
- CSS (for styling)

### Why This Tech Stack?
- **React.js:** Provides a fast and efficient way to build user interfaces, making the app interactive and responsive.
- **Axios:** Used for making asynchronous HTTP requests to the OpenWeatherMap API and handling API responses.
- **React Loader Spinner:** Adds a loading spinner to indicate when weather data is being fetched.
- **Font Awesome:** Used for adding icons to enhance the user interface.

### Challenges Faced
One of the challenges faced during development was handling asynchronous API requests and updating the UI based on the API response. Another challenge was styling the application to create a visually appealing and user-friendly interface.

### Future Scope
- Implementing additional features such as forecast data for upcoming days.
- Adding geolocation to automatically detect the user's location and display weather information.
- Improving error handling and user feedback.

## How to Install and Run the Project
1. Clone the repository to your local machine:
   git clone https://github.com/ShubhamSakhareGEM/ShubhamSakhareGEM.git
2. Navigate to the project directory:
   cd weather-app
3. Install dependencies:
   npm install axios react-loader-spinner @fortawesome/react-fontawesome @fortawesome/free-solid-svg-icons
4. Create a `.env` file in the root directory and add your OpenWeatherMap API key:
   REACT_APP_API_KEY=your-api-key-goes-here
5. Start the development server:
   npm start
6. Open your browser and visit http://localhost:3000 to view the app.

## How to Use the Project
- Enter the name of a city in the search bar and press Enter or click the search button.
- The app will display the current weather information for the specified city, including temperature, humidity, wind speed, and weather description.
- If the city is not found or there is an error fetching weather data, an error message will be displayed.