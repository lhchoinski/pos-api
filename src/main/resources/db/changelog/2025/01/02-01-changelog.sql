-- liquibase formatted sql

--changeset Luiz:20250119-02-01
INSERT INTO customers (name, address, phone, email, active, version, created_at)
VALUES ('JOHN DOE', '1234 Elm Street', '5550100', 'john.doe@example.com', false, 0, now()),
       ('JANE SMITH', '5678 Oak Avenue', '5550101', 'jane.smith@example.com', true, 0, now()),
       ('ROBERT BROWN', '9102 Maple Lane', '5550102', 'robert.brown@example.com', true, 0, now()),
       ('EMILY JOHNSON', '1213 Pine Blvd', '5550103', 'emily.johnson@example.com', true, 0, now()),
       ('MICHAEL WILLIAMS', '1415 Cedar Road', '5550104', 'michael.williams@example.com', true, 0, now()),
       ('SARAH DAVIS', '1617 Birch St', '5550105', 'sarah.davis@example.com', true, 0, now()),
       ('JAMES MILLER', '1819 Redwood Dr', '5550106', 'james.miller@example.com', false, 0, now()),
       ('PATRICIA WILSON', '2021 Walnut Crescent', '5550107', 'patricia.wilson@example.com', true, 0, now()),
       ('DAVID MOORE', '2324 Ash Rd', '5550108', 'david.moore@example.com', true, 0, now()),
       ('LINDA TAYLOR', '2526 Fir Blvd', '5550109', 'linda.taylor@example.com', true, 0, now()),
       ('THOMAS ANDERSON', '2728 Cypress St', '5550110', 'thomas.anderson@example.com', true, 0, now()),
       ('BETTY THOMAS', '2929 Hickory Ln', '5550111', 'betty.thomas@example.com', true, 0, now()),
       ('CHARLES JACKSON', '3030 Palm Rd', '5550112', 'charles.jackson@example.com', true, 0, now()),
       ('BARBARA WHITE', '3232 Poplar Dr', '5550113', 'barbara.white@example.com', true, 0, now()),
       ('DANIEL HARRIS', '3434 Oak Rd', '5550114', 'daniel.harris@example.com', false, 0, now()),
       ('NANCY MARTIN', '3636 Cedar Blvd', '5550115', 'nancy.martin@example.com', true, 0, now()),
       ('PAUL LEE', '3838 Birch Lane', '5550116', 'paul.lee@example.com', true, 0, now()),
       ('DEBORAH ALLEN', '4040 Redwood St', '5550117', 'deborah.allen@example.com', true, 0, now()),
       ('KEVIN YOUNG', '4242 Elm Rd', '5550118', 'kevin.young@example.com', true, 0, now()),
       ('SANDRA KING', '4444 Pine Ln', '5550119', 'sandra.king@example.com', true, 0, now()),
       ('STEVEN SCOTT', '4646 Maple Blvd', '5550120', 'steven.scott@example.com', true, 0, now()),
       ('CAROL ADAMS', '4848 Oak St', '5550121', 'carol.adams@example.com', false, 0, now()),
       ('GARY BAKER', '5050 Cedar Rd', '5550122', 'gary.baker@example.com', true, 0, now()),
       ('SHARON NELSON', '5252 Cypress Ln', '5550123', 'sharon.nelson@example.com', false, 0, now()),
       ('RICHARD CARTER', '5454 Fir Blvd', '5550124', 'richard.carter@example.com', true, 0, now()),
       ('HELEN MITCHELL', '5656 Hickory St', '5550125', 'helen.mitchell@example.com', true, 0, now()),
       ('JOHN PEREZ', '5858 Palm Ave', '5550126', 'john.perez@example.com', false, 0, now()),
       ('JESSICA ROBERTS', '6060 Oak Dr', '5550127', 'jessica.roberts@example.com', true, 0, now()),
       ('CHRISTOPHER WALKER', '6262 Pine Rd', '5550128', 'christopher.walker@example.com', false, 0, now()),
       ('MICHELLE GREEN', '6464 Maple Ln', '5550129', 'michelle.green@example.com', true, 0, now()),
       ('BRIAN EVANS', '6666 Birch St', '5550130', 'brian.evans@example.com', true, 0, now()),
       ('EMILY COLLINS', '6868 Redwood Blvd', '5550131', 'emily.collins@example.com', true, 0, now()),
       ('MATTHEW MORRIS', '7070 Palm Blvd', '5550132', 'matthew.morris@example.com', true, 0, now()),
       ('ANNA EDWARDS', '7272 Oak Rd', '5550133', 'anna.edwards@example.com', true, 0, now()),
       ('JOSHUA WOOD', '7474 Cedar Ln', '5550134', 'joshua.wood@example.com', true, 0, now()),
       ('MARGARET PEREZ', '7676 Pine Dr', '5550135', 'margaret.perez@example.com', true, 0, now()),
       ('BENJAMIN REED', '7878 Maple Rd', '5550136', 'benjamin.reed@example.com', true, 0, now()),
       ('KATHRYN COOPER', '8080 Fir Ave', '5550137', 'kathryn.cooper@example.com', true, 0, now()),
       ('RONALD BAILEY', '8282 Hickory Blvd', '5550138', 'ronald.bailey@example.com', false, 0, now()),
       ('DONNA GOMEZ', '8484 Palm Dr', '5550139', 'donna.gomez@example.com', true, 0, now()),
       ('DONALD MORRIS', '8686 Oak Ave', '5550140', 'donald.morris@example.com', true, 0, now()),
       ('BETTY ROGERS', '8888 Cedar Blvd', '5550141', 'betty.rogers@example.com', true, 0, now()),
       ('PETER STEWART', '9090 Pine Blvd', '5550142', 'peter.stewart@example.com', true, 0, now()),
       ('ALICE MARTINEZ', '9292 Maple St', '5550143', 'alice.martinez@example.com', true, 0, now()),
       ('GEORGE MURPHY', '9494 Fir Dr', '5550144', 'george.murphy@example.com', true, 0, now()),
       ('LAURA DIAZ', '9696 Hickory Rd', '5550145', 'laura.diaz@example.com', true, 0, now());

