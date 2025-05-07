1. Get: localhost:8081/api/rooms

2. Post: localhost:8081/api/rooms
   body:
   {
   "id": "123",
   "roomNumber": "ef3",
   "numberOfPax": 5,
   "pricePerNight": 1000,
   "amenities": ["asdf"]
   }

3. Put: localhost:8081/api/rooms/123
   body:
   {
   "id": "123",
      "roomNumber": "ef3",
      "numberOfPax": 15,
      "pricePerNight": 11000,
      "amenities": ["Hall", "Kitchen"]
   }

4. Delete: localhost:8081/api/rooms/123