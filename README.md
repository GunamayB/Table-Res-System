#Table Reservation System

This project contains the source code for a table reservation system that alllows tables within a restaurant to be booked for a group of guests. The guests are required to provide their name, phone number, total number of seats, and requested date.

The restaurant has ten tables(T01......T10) for 2 people, six tables(F01......F06) for 6 people, and three tables(H01....H03) for eight people.
When a booking request is recorded, the system will update the record with a pending status. The staff can then check for tables and update the request for the assigned tables after which the status of the record will be changed to accepted.

The program also handles cancellation of booking without limitation of record status. It is also possible to generate a listing of all current bookings with record status wither 'accepted' or 'oending'. 
When listing current records, all pending bookings will show pending alongside the request. If a booking has been accepted, the table codes will be shown in listing.

The booking system has been equipped with logic to suggest which tables can be assigned for a booking based on the required number of seats and available seats on available tables.

The booking system also comes with a ticketing mechanism to maintain uniqueness of requests.
For each business day, a ticketing mechanism is followed where every request is assigned a unique ticket which is not reused under any circumstance including cancellation of booking.
As an example, if Mr. Alex is the first request of the day, their request is allotted ticket no. 1, Ms. Emma, the second booking of the day is allotted ticket no.2
Now, if Mr. Alex were to cancel his booking, ticket number 1 would not be released and used again.

The program is also built with the facility to undo and redo operations.
