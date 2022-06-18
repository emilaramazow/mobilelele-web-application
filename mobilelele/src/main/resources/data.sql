INSERT INTO users (id, email, first_name, last_name, imageurl, is_active, password)
VALUES (1, "emil.aramazow@abv.bg", "Emil", "Aramazov", null, 1, "3f0b0edb55e36615872c89cb123610abffa629d95db3e9f94be85a3266c34baeb27cda57574a1259");

INSERT INTO brands (id, name)
VALUES (1, 'Ford'),
(2, "Toyota");

INSERT INTO models (id, name, category, start_year, end_year, brand_id, image_url)
VALUES (1, 'Fiesta', 'CAR', 1976, null, 1, 'https://upload.wikimedia.org/wikipedia/commons/7/7d/2017_Ford_Fiesta_Zetec_Turbo_1.0_Front.jpg'),
        (2, 'Escort', 'CAR', 1968, 2000, 1, 'https://www.auto-data.net/images/f48/Ford-Escort-VI-Hatch-GAL.jpg'),
        (3, 'Yaris', 'CAR', 2020, null, 2, 'https://automedia.investor.bg/media/files/resized/gallery/760x/bb8/9001b5fe742698ef0d5344a221e74bb8-toyota-yaris-gr-sport%20(6).jpg');