FROM mcr.microsoft.com/vscode/devcontainers/base:jammy

# Install Java
RUN apt-get update && \
    apt-get install -y openjdk-11-jdk && \
    rm -rf /var/lib/apt/lists/*