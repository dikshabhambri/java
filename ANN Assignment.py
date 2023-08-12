import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler

# Load the data into a pandas dataframe
data = pd.read_csv('crop_data.csv')

# Split the data into input and target variables
X = data.drop(['crop_yield'], axis=1).values
y = data['crop_yield'].values

# Split the data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=0)

# Scale the data to a common range
sc = StandardScaler()
X_train = sc.fit_transform(X_train)
X_test = sc.transform(X_test)

# Define the number of input, hidden, and output nodes
input_nodes = X_train.shape[1]
hidden_nodes = 10
output_nodes = 1

# Define the learning rate and number of iterations
learning_rate = 0.1
num_iterations = 100

# Initialize the weights and biases randomly
W1 = np.random.randn(input_nodes, hidden_nodes)
b1 = np.random.randn(1, hidden_nodes)
W2 = np.random.randn(hidden_nodes, output_nodes)
b2 = np.random.randn(1, output_nodes)

# Define the sigmoid activation function
def sigmoid(x):
    return 1 / (1 + np.exp(-x))

# Define the derivative of the sigmoid function
def sigmoid_derivative(x):
    return x * (1 - x)

# Train the model using backpropagation
for i in range(num_iterations):
    # Forward propagation  hidden_layer = sigmoid(np.dot(X_train, W1) + b1)
    output_layer = sigmoid(np.dot(hidden_layer, W2) + b2)
    
    # Compute the error
    error = y_train.reshape(-1,1) - output_layer
    
    # Backward propagation
    output_delta = error * sigmoid_derivative(output_layer)
    hidden_delta = output_delta.dot(W2.T) * sigmoid_derivative(hidden_layer)
    
    # Update the weights and biases
    W2 += learning_rate * hidden_layer.T.dot(output_delta)
    b2 += learning_rate * np.sum(output_delta, axis=0, keepdims=True)
    W1 += learning_rate * X_train.T.dot(hidden_delta)
    b1 += learning_rate * np.sum(hidden_delta, axis=0)

    # Make predictions on the test set
hidden_layer = sigmoid(np.dot(X_test, W1) + b1)
y_pred = sigmoid(np.dot(hidden_layer, W2) + b2)

# Compute the mean squared error
mse = np.mean(np.square(y_test.reshape(-1,1) - y_pred))

print('Mean Squared Error:', mse)

# Use the model to make predictions on new data
new_data = np.array([[20, 30, 50, 6.5]])
new_data = sc.transform(new_data)

hidden_layer = sigmoid(np.dot(new_data, W1) + b1)
prediction = sigmoid(np.dot(hidden_layer, W2) + b2)

print('Predicted crop yield:', prediction[0][0])
