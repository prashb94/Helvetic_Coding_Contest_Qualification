# Helvetic_Coding_Contest_Qualification

Where in the world is Heidi?

While looking for Heidi, you found her travel planner, which contains her notes about possible trips she could do.

Each line represents a possible journey from one city to another (journeys are one-way only), at a certain cost (a strictly positive integer).

As Heidi is not very rich, and rather impulsive, her travel strategy is very simple: from her hometown of Lausanne, pick the cheapest transport option, which leads her to a new town. Pick the cheapest transport option again, to get to another town, and repeat the operation until she doesn't have enough money to pay for the next ticket.

Your task is to find where Heidi ended up, knowing that she started with CHF 200.

(It is guaranteed that there are no two journeys at the same cost from the same city.)

# Sample

Lausanne -> Bern : 40
Bern -> Zürich : 100
Lausanne -> St-Gallen : 80
Bern -> St-Gallen : 60
St-Gallen -> Basel : 80
Geneva -> Basel : 40
St-Gallen -> Lausanne : 70
Bern -> Basel : 80
Lugano -> Paris: 60
Geneva -> Lugano : 20
St-Gallen -> Geneva : 60
Lugano -> Rome : 30
Heidi spent 40.- to get to Bern, then 60.- to St-Gallen, 60.- to Geneva, and 20.- to to Lugano, which left her with CHF 20, not enough to pay for the next trip; the answer is thus:

Lugano
