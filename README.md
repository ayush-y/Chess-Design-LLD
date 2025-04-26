 ## Requirements

### Basic Chess Rules:

- Implement basic movement rules for all pieces (Pawn, Rook, Knight, Bishop, Queen, King).

- Add checks for piece capturing.

- Avoid implementing advanced rules like castling, en passant, or pawn promotion initially (optional enhancements).
- we are using black and white pieces.
- Kings: 1 white and 1 black. The most important piece. The game ends when a king is checkmated.

- Queens: 1 white and 1 black. The most powerful piece, capable of moving any number of squares in any direction.

- Rooks: 2 white and 2 black. They move horizontally or vertically across the board.

- Bishops: 2 white and 2 black. Each moves diagonally and stays on squares of their initial color.

- Knights: 2 white and 2 black. They move in an "L" shape: two squares in one direction and one perpendicular.

- Pawns: 8 white and 8 black, These are the most numerous and advance only one square forward (except on their first move) but capture diagonally.

### Solution requirements

- Do we need to store the data in any kind of database or in memory storage is fine ?
  - In memory storage is fine
- Do we need to implement any kind of network api based interactions or a console driven app ?
  - Console app is fine
- Do we need to write only the class structures ?
-  or implement working code ?
  - As much working code as possible is required.
  - Add Other Pieces: Implement Rook, Knight, Bishop, Queen, and King classes with their respective move logic.

- Enhance Move Validation: Add checks for special rules
- (e.g., ensuring the King is not in check).

- Optional Bot: Create a bot that makes random valid moves or follows simple strategies.

  - Game Conditions: Check for win conditions like checkmate or stalemate.
  - In-Memory Chessboard Representation
  - Use a 2D array (Piece[][] board) to store the pieces.

  - Each cell represents a square on the board. Null indicates an empty square.

### Feature requirements

- Here we need to implement a console based 2 player chess game.
- All the basic rules of chess should be kept in mind (not all the advanced rules are mandatory for ex: Castling)
- Basic feature like multi piece support, user should be able to move pieces here and there, attack pieces etc.
- Good to have: For every piece if we can have their dedicated move structure then its a good to have
- Game should be a in a playable state, i.e. code must be in a running state.
- Good to have: Support bot based player as well.


### Non functional requirements

- Code should be modular and extensible
- Code should follow all the relevant OOP's concept
- Code should follow all Solid principles
- Code should be in a running state
- no db connection required
### OOP and SOLID Principles:

- Use inheritance for different chess pieces
- (e.g., Piece as a base class and derived classes like Pawn, Rook, etc.).

- Ensure single responsibility for classes and avoid tight coupling.

- Use dependency injection where needed.
- Game interacts with Player and Chessboard but knows nothing about the specific implementations of pieces or strategies.

 - Chessboard validates moves using the Piece base class and delegates piece-specific behavior to derived classes.

 - Piece subclasses implement movement rules (isValidMove()),
 - adhering to the Single Responsibility Principle.

- MoveValidator ensures a piece's move adheres to general rules
- (e.g., staying within bounds).
- special conditions like avoiding putting the king in check.
