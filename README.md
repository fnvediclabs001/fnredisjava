* * Sample Java Project to Connect to a Redis

   - This project demonstrates how to establish a connection to a Redis using Java.

* Configure Connection Details in RedisUtil.java

  - In the MySQLUtil.java class, replace the following connection details:
  - {{REDIS_URL}}: the URL of your REDIS
  - {{REDIS_PORT}}: Redis port
  - {{REDIS_AUTH_KEY}}: Authentication Key

* Implement CRUD Operations in the Service Class

  - In the MySQLService class, add the following methods to perform CRUD (Create, Read, Update, Delete) operations:
  - create(): creates a new record in the database
  - read(): retrieves a record from the database
  - update(): updates an existing record in the database
  - delete(): deletes a record from the database

* Table information
  -  Table name :securitydata
	// Columns
	 * 1. id: Unique identifier for each stock record (Primary Key, Auto Increment).
	 * 2. ticker: Stock ticker symbol (e.g., AAPL, TSLA) (VARCHAR, Unique). 
	 * 3. company_name: Name of the company (VARCHAR). 
	 * 4. market_sector: Sector the company belongs to (e.g., Technology, Finance) (VARCHAR). 
	 * 5. bid_price: Current bid price for the stock (DECIMAL). 
	 * 6. ask_price: Current ask price for the stock (DECIMAL). 
	 * 7. market_price: The latest traded price of the stock (DECIMAL). 
	 * 8. volume: Number of shares traded (INTEGER). 
	 * 9. day_high: The highest price of the stock for the day (DECIMAL). 
	 * 10. day_low: The lowest price of the stock for the day (DECIMAL). 
	 * 11. pe_ratio: Price-to-Earnings ratio (DECIMAL).
	 * 
	 

   - Sample insert query: "INSERT INTO securitydata (ticker, company_name, market_sector, bid_price,ask_price,market_price,volume,day_high,day_low,pe_ratio) values (?,?,?,?,?,?,?,?,?,?)";
  
