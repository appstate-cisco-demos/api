const { MongoClient } = require('mongodb');

const uri = 'mongodb://user:password@mongodb:27017';

const client = new MongoClient(uri, {
    useUnifiedTopology: true,
    useNewUrlParser: true
});

connect();

async function connect() {
    try {
        await client.connect();
        const db = client.db('demo');
        console.log('successfully connected to database');

        const collection = db.collection('people');

        const cursorInsertion = await collection.insertMany(
        [
            {
                "id": "1",
                "firstName": "Sarah",
                "lastName": "Johnson",
                "age": 32
            },
            {
                "id": "2",
                "firstName": "Michael",
                "lastName": "Smith",
                "age": 45
            },
            {
                "id": "3",
                "firstName": "Emily",
                "lastName": "Brown",
                "age": 28
            },
            {
                "id": "4",
                "firstName": "David",
                "lastName": "Davis",
                "age": 38
            },
            {
                "id": "5",
                "firstName": "Jessica",
                "lastName": "Williams",
                "age": 29
            },
            {
                "id": "6",
                "firstName": "John",
                "lastName": "Wilson",
                "age": 41
            },
            {
                "id": "7",
                "firstName": "Ashley",
                "lastName": "Jones",
                "age": 35
            },
            {
                "id": "8",
                "firstName": "Robert",
                "lastName": "Miller",
                "age": 50
            },
            {
                "id": "9",
                "firstName": "Olivia",
                "lastName": "Anderson",
                "age": 27
            },
            {
                "id": "10",
                "firstName": "William",
                "lastName": "Taylor",
                "age": 33
            }
        ]
        )
    } catch (err) {
        console.error(err);
    }
}