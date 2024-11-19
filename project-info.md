## 1. Game Library Management

### Features:
- Add, remove, or update games.
- Search/filter games by name or category.
- Sync with external platforms.

### Entities:

#### Game

**Properties:**

| **Property**   | **Type**   | **Description**                                                                                  | **Default** |
|----------------|------------|--------------------------------------------------------------------------------------------------|-------------|
| \_id           | String     | Unique identifier for each game                                                                  |             |
| title          | String     | Name of the game (e.g., "The Witcher 3")                                                         |             |
| platform       | String     | Gaming platform (e.g., "PC", "Xbox", "PlayStation", "Switch")                                    |             |
| category       | String     | Genres or tags associated with the game (e.g., \["RPG", "Adventure"\])                           |             |
| status         | String     | Status of the game in the user's library (e.g., "Completed", "Wishlist", "In Progress")          |             |
| hoursPlayed    | int        | Number of hours logged by the user                                                               | 0           |
| rating         | double     | User's personal rating (out of 10)                                                               |             |
| releaseDate    | LocalDate  | Release date of the game                                                                         |             |
| coverImage     | String     | URL for the game’s cover image                                                                   |             |
| addedBy        | String     | User ID who added this game                                                                      |             |
| syncedFrom     | String     | Source of sync (e.g., "Steam", "Xbox", "Manual")                                                 | "Manual"    |
| createdAt      | LocalDate  | Timestamp when the game was added to the library                                                 |             |
| updatedAt      | LocalDate  | Timestamp when the game was last modified                                                        |             |


 